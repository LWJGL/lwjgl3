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
 * Structure specifying layer properties.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code layerName[VK_MAX_EXTENSION_NAME_SIZE]} &ndash; a null-terminated UTF-8 string specifying the name of the layer. Use this name in the {@code ppEnabledLayerNames} array passed in the {@link VkInstanceCreateInfo} structure to enable this layer for an instance.</li>
 * <li>{@code specVersion} &ndash; the Vulkan version the layer was written to, encoded as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#extendingvulkan-coreversions-versionnumbers">Version Numbers</a>.</li>
 * <li>{@code implementationVersion} &ndash; the version of this layer. It is an integer, increasing with backward compatible changes.</li>
 * <li>{@code description[VK_MAX_DESCRIPTION_SIZE]} &ndash; a null-terminated UTF-8 string providing additional details that <b>can</b> be used by the application to identify the layer.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkLayerProperties {
 *     char layerName[VK_MAX_EXTENSION_NAME_SIZE];
 *     uint32_t specVersion;
 *     uint32_t implementationVersion;
 *     char description[VK_MAX_DESCRIPTION_SIZE];
 * }</code></pre>
 */
public class VkLayerProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LAYERNAME,
        SPECVERSION,
        IMPLEMENTATIONVERSION,
        DESCRIPTION;

    static {
        Layout layout = __struct(
            __array(1, VK_MAX_EXTENSION_NAME_SIZE),
            __member(4),
            __member(4),
            __array(1, VK_MAX_DESCRIPTION_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LAYERNAME = layout.offsetof(0);
        SPECVERSION = layout.offsetof(1);
        IMPLEMENTATIONVERSION = layout.offsetof(2);
        DESCRIPTION = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkLayerProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkLayerProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the {@code layerName} field. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer layerName() { return nlayerName(address()); }
    /** Decodes the null-terminated string stored in the {@code layerName} field. */
    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public String layerNameString() { return nlayerNameString(address()); }
    /** Returns the value of the {@code specVersion} field. */
    @NativeType("uint32_t")
    public int specVersion() { return nspecVersion(address()); }
    /** Returns the value of the {@code implementationVersion} field. */
    @NativeType("uint32_t")
    public int implementationVersion() { return nimplementationVersion(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** Decodes the null-terminated string stored in the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }

    // -----------------------------------

    /** Returns a new {@code VkLayerProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkLayerProperties malloc() {
        return wrap(VkLayerProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkLayerProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkLayerProperties calloc() {
        return wrap(VkLayerProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkLayerProperties} instance allocated with {@link BufferUtils}. */
    public static VkLayerProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkLayerProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkLayerProperties} instance for the specified memory address. */
    public static VkLayerProperties create(long address) {
        return wrap(VkLayerProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkLayerProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkLayerProperties.class, address);
    }

    /**
     * Returns a new {@link VkLayerProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLayerProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkLayerProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLayerProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLayerProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkLayerProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkLayerProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkLayerProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkLayerProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkLayerProperties} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkLayerProperties mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkLayerProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkLayerProperties callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkLayerProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLayerProperties mallocStack(MemoryStack stack) {
        return wrap(VkLayerProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkLayerProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLayerProperties callocStack(MemoryStack stack) {
        return wrap(VkLayerProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkLayerProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkLayerProperties.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkLayerProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkLayerProperties.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkLayerProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLayerProperties.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLayerProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLayerProperties.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #layerName}. */
    public static ByteBuffer nlayerName(long struct) { return memByteBuffer(struct + VkLayerProperties.LAYERNAME, VK_MAX_EXTENSION_NAME_SIZE); }
    /** Unsafe version of {@link #layerNameString}. */
    public static String nlayerNameString(long struct) { return memUTF8(struct + VkLayerProperties.LAYERNAME); }
    /** Unsafe version of {@link #specVersion}. */
    public static int nspecVersion(long struct) { return UNSAFE.getInt(null, struct + VkLayerProperties.SPECVERSION); }
    /** Unsafe version of {@link #implementationVersion}. */
    public static int nimplementationVersion(long struct) { return UNSAFE.getInt(null, struct + VkLayerProperties.IMPLEMENTATIONVERSION); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkLayerProperties.DESCRIPTION, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + VkLayerProperties.DESCRIPTION); }

    // -----------------------------------

    /** An array of {@link VkLayerProperties} structs. */
    public static class Buffer extends StructBuffer<VkLayerProperties, Buffer> implements NativeResource {

        private static final VkLayerProperties ELEMENT_FACTORY = VkLayerProperties.create(-1L);

        /**
         * Creates a new {@code VkLayerProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkLayerProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkLayerProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link ByteBuffer} view of the {@code layerName} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer layerName() { return VkLayerProperties.nlayerName(address()); }
        /** Decodes the null-terminated string stored in the {@code layerName} field. */
        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public String layerNameString() { return VkLayerProperties.nlayerNameString(address()); }
        /** Returns the value of the {@code specVersion} field. */
        @NativeType("uint32_t")
        public int specVersion() { return VkLayerProperties.nspecVersion(address()); }
        /** Returns the value of the {@code implementationVersion} field. */
        @NativeType("uint32_t")
        public int implementationVersion() { return VkLayerProperties.nimplementationVersion(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkLayerProperties.ndescription(address()); }
        /** Decodes the null-terminated string stored in the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkLayerProperties.ndescriptionString(address()); }

    }

}