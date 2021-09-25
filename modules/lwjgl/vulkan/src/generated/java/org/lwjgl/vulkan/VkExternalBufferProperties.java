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
 * Structure specifying supported external handle capabilities.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExternalMemoryProperties}, {@link VK11#vkGetPhysicalDeviceExternalBufferProperties GetPhysicalDeviceExternalBufferProperties}, {@link KHRExternalMemoryCapabilities#vkGetPhysicalDeviceExternalBufferPropertiesKHR GetPhysicalDeviceExternalBufferPropertiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExternalBufferProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkExternalMemoryProperties VkExternalMemoryProperties} {@link #externalMemoryProperties};
 * }</code></pre>
 */
public class VkExternalBufferProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTERNALMEMORYPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExternalMemoryProperties.SIZEOF, VkExternalMemoryProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTERNALMEMORYPROPERTIES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkExternalBufferProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalBufferProperties(ByteBuffer container) {
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
    /** a {@link VkExternalMemoryProperties} structure specifying various capabilities of the external handle type when used with the specified buffer creation parameters. */
    public VkExternalMemoryProperties externalMemoryProperties() { return nexternalMemoryProperties(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExternalBufferProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES} value to the {@link #sType} field. */
    public VkExternalBufferProperties sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExternalBufferProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExternalBufferProperties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExternalBufferProperties set(VkExternalBufferProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExternalBufferProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalBufferProperties malloc() {
        return wrap(VkExternalBufferProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkExternalBufferProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalBufferProperties calloc() {
        return wrap(VkExternalBufferProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkExternalBufferProperties} instance allocated with {@link BufferUtils}. */
    public static VkExternalBufferProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkExternalBufferProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkExternalBufferProperties} instance for the specified memory address. */
    public static VkExternalBufferProperties create(long address) {
        return wrap(VkExternalBufferProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalBufferProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkExternalBufferProperties.class, address);
    }

    /**
     * Returns a new {@link VkExternalBufferProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalBufferProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExternalBufferProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalBufferProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalBufferProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalBufferProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkExternalBufferProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalBufferProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalBufferProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalBufferProperties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalBufferProperties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalBufferProperties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalBufferProperties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalBufferProperties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalBufferProperties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalBufferProperties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalBufferProperties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkExternalBufferProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalBufferProperties malloc(MemoryStack stack) {
        return wrap(VkExternalBufferProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkExternalBufferProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalBufferProperties calloc(MemoryStack stack) {
        return wrap(VkExternalBufferProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalBufferProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalBufferProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalBufferProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalBufferProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExternalBufferProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalBufferProperties.PNEXT); }
    /** Unsafe version of {@link #externalMemoryProperties}. */
    public static VkExternalMemoryProperties nexternalMemoryProperties(long struct) { return VkExternalMemoryProperties.create(struct + VkExternalBufferProperties.EXTERNALMEMORYPROPERTIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExternalBufferProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExternalBufferProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkExternalBufferProperties} structs. */
    public static class Buffer extends StructBuffer<VkExternalBufferProperties, Buffer> implements NativeResource {

        private static final VkExternalBufferProperties ELEMENT_FACTORY = VkExternalBufferProperties.create(-1L);

        /**
         * Creates a new {@code VkExternalBufferProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalBufferProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkExternalBufferProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExternalBufferProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalBufferProperties.nsType(address()); }
        /** @return the value of the {@link VkExternalBufferProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkExternalBufferProperties.npNext(address()); }
        /** @return a {@link VkExternalMemoryProperties} view of the {@link VkExternalBufferProperties#externalMemoryProperties} field. */
        public VkExternalMemoryProperties externalMemoryProperties() { return VkExternalBufferProperties.nexternalMemoryProperties(address()); }

        /** Sets the specified value to the {@link VkExternalBufferProperties#sType} field. */
        public VkExternalBufferProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkExternalBufferProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES} value to the {@link VkExternalBufferProperties#sType} field. */
        public VkExternalBufferProperties.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES); }
        /** Sets the specified value to the {@link VkExternalBufferProperties#pNext} field. */
        public VkExternalBufferProperties.Buffer pNext(@NativeType("void *") long value) { VkExternalBufferProperties.npNext(address(), value); return this; }

    }

}