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
 * <p>If the {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with values indicating whether the feature is supported. {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable this feature.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRUniformBufferStandardLayout#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code uniformBufferStandardLayout} &ndash; indicates that the implementation supports the same layouts for uniform buffers as for storage and other kinds of buffers. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#interfaces-resources-standard-layout">Standard Buffer Layout</a>.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 uniformBufferStandardLayout;
 * }</code></pre>
 */
public class VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR extends Struct implements NativeResource {

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
     * Creates a {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code uniformBufferStandardLayout} field. */
    @NativeType("VkBool32")
    public boolean uniformBufferStandardLayout() { return nuniformBufferStandardLayout(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code uniformBufferStandardLayout} field. */
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) { nuniformBufferStandardLayout(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR set(
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
    public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR set(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #uniformBufferStandardLayout}. */
    public static int nuniformBufferStandardLayout(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.UNIFORMBUFFERSTANDARDLAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #uniformBufferStandardLayout(boolean) uniformBufferStandardLayout}. */
    public static void nuniformBufferStandardLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.UNIFORMBUFFERSTANDARDLAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.npNext(address()); }
        /** Returns the value of the {@code uniformBufferStandardLayout} field. */
        @NativeType("VkBool32")
        public boolean uniformBufferStandardLayout() { return VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.nuniformBufferStandardLayout(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code uniformBufferStandardLayout} field. */
        public VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.Buffer uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR.nuniformBufferStandardLayout(address(), value ? 1 : 0); return this; }

    }

}