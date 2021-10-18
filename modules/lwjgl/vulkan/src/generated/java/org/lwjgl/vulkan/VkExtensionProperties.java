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

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure specifying an extension properties.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoDecodeH264CapabilitiesEXT}, {@link VkVideoDecodeH264SessionCreateInfoEXT}, {@link VkVideoDecodeH265CapabilitiesEXT}, {@link VkVideoDecodeH265SessionCreateInfoEXT}, {@link VkVideoEncodeH264CapabilitiesEXT}, {@link VkVideoEncodeH264SessionCreateInfoEXT}, {@link VkVideoEncodeH265CapabilitiesEXT}, {@link VkVideoEncodeH265SessionCreateInfoEXT}, {@link VK10#vkEnumerateDeviceExtensionProperties EnumerateDeviceExtensionProperties}, {@link VK10#vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExtensionProperties {
 *     char {@link #extensionName}[VK_MAX_EXTENSION_NAME_SIZE];
 *     uint32_t {@link #specVersion};
 * }</code></pre>
 */
public class VkExtensionProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EXTENSIONNAME,
        SPECVERSION;

    static {
        Layout layout = __struct(
            __array(1, VK_MAX_EXTENSION_NAME_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EXTENSIONNAME = layout.offsetof(0);
        SPECVERSION = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkExtensionProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExtensionProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** an array of {@link VK10#VK_MAX_EXTENSION_NAME_SIZE MAX_EXTENSION_NAME_SIZE} {@code char} containing a null-terminated UTF-8 string which is the name of the extension. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer extensionName() { return nextensionName(address()); }
    /** an array of {@link VK10#VK_MAX_EXTENSION_NAME_SIZE MAX_EXTENSION_NAME_SIZE} {@code char} containing a null-terminated UTF-8 string which is the name of the extension. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public String extensionNameString() { return nextensionNameString(address()); }
    /** the version of this extension. It is an integer, incremented with backward compatible changes. */
    @NativeType("uint32_t")
    public int specVersion() { return nspecVersion(address()); }

    // -----------------------------------

    /** Returns a new {@code VkExtensionProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExtensionProperties malloc() {
        return wrap(VkExtensionProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkExtensionProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExtensionProperties calloc() {
        return wrap(VkExtensionProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkExtensionProperties} instance allocated with {@link BufferUtils}. */
    public static VkExtensionProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkExtensionProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkExtensionProperties} instance for the specified memory address. */
    public static VkExtensionProperties create(long address) {
        return wrap(VkExtensionProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExtensionProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkExtensionProperties.class, address);
    }

    /**
     * Returns a new {@link VkExtensionProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExtensionProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExtensionProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExtensionProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExtensionProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExtensionProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkExtensionProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExtensionProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExtensionProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExtensionProperties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExtensionProperties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExtensionProperties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExtensionProperties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExtensionProperties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExtensionProperties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExtensionProperties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExtensionProperties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkExtensionProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExtensionProperties malloc(MemoryStack stack) {
        return wrap(VkExtensionProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkExtensionProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExtensionProperties calloc(MemoryStack stack) {
        return wrap(VkExtensionProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExtensionProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExtensionProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExtensionProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExtensionProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #extensionName}. */
    public static ByteBuffer nextensionName(long struct) { return memByteBuffer(struct + VkExtensionProperties.EXTENSIONNAME, VK_MAX_EXTENSION_NAME_SIZE); }
    /** Unsafe version of {@link #extensionNameString}. */
    public static String nextensionNameString(long struct) { return memUTF8(struct + VkExtensionProperties.EXTENSIONNAME); }
    /** Unsafe version of {@link #specVersion}. */
    public static int nspecVersion(long struct) { return UNSAFE.getInt(null, struct + VkExtensionProperties.SPECVERSION); }

    // -----------------------------------

    /** An array of {@link VkExtensionProperties} structs. */
    public static class Buffer extends StructBuffer<VkExtensionProperties, Buffer> implements NativeResource {

        private static final VkExtensionProperties ELEMENT_FACTORY = VkExtensionProperties.create(-1L);

        /**
         * Creates a new {@code VkExtensionProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExtensionProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkExtensionProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@link VkExtensionProperties#extensionName} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer extensionName() { return VkExtensionProperties.nextensionName(address()); }
        /** @return the null-terminated string stored in the {@link VkExtensionProperties#extensionName} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public String extensionNameString() { return VkExtensionProperties.nextensionNameString(address()); }
        /** @return the value of the {@link VkExtensionProperties#specVersion} field. */
        @NativeType("uint32_t")
        public int specVersion() { return VkExtensionProperties.nspecVersion(address()); }

    }

}