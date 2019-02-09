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
 * Structure specifying external image format properties.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code imageFormatProperties} &ndash; will be filled in as when calling {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}, but the values returned <b>may</b> vary depending on the external handle type requested.</li>
 * <li>{@code externalMemoryFeatures} &ndash; a bitmask of {@code VkExternalMemoryFeatureFlagBitsNV}, indicating properties of the external memory handle type ({@link NVExternalMemoryCapabilities#vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV}{@code ::externalHandleType}) being queried, or 0 if the external memory handle type is 0.</li>
 * <li>{@code exportFromImportedHandleTypes} &ndash; a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} containing a bit set for every external handle type that <b>may</b> be used to create memory from which the handles of the type specified in {@link NVExternalMemoryCapabilities#vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV}{@code ::externalHandleType} <b>can</b> be exported, or 0 if the external memory handle type is 0.</li>
 * <li>{@code compatibleHandleTypes} &ndash; a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} containing a bit set for every external handle type that <b>may</b> be specified simultaneously with the handle type specified by {@link NVExternalMemoryCapabilities#vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV}{@code ::externalHandleType} when calling {@link VK10#vkAllocateMemory AllocateMemory}, or 0 if the external memory handle type is 0. {@code compatibleHandleTypes} will always contain {@link NVExternalMemoryCapabilities#vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV}{@code ::externalHandleType}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExternalImageFormatPropertiesNV {
 *     {@link VkImageFormatProperties VkImageFormatProperties} imageFormatProperties;
 *     VkExternalMemoryFeatureFlagsNV externalMemoryFeatures;
 *     VkExternalMemoryHandleTypeFlagsNV exportFromImportedHandleTypes;
 *     VkExternalMemoryHandleTypeFlagsNV compatibleHandleTypes;
 * }</code></pre>
 */
public class VkExternalImageFormatPropertiesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IMAGEFORMATPROPERTIES,
        EXTERNALMEMORYFEATURES,
        EXPORTFROMIMPORTEDHANDLETYPES,
        COMPATIBLEHANDLETYPES;

    static {
        Layout layout = __struct(
            __member(VkImageFormatProperties.SIZEOF, VkImageFormatProperties.ALIGNOF),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IMAGEFORMATPROPERTIES = layout.offsetof(0);
        EXTERNALMEMORYFEATURES = layout.offsetof(1);
        EXPORTFROMIMPORTEDHANDLETYPES = layout.offsetof(2);
        COMPATIBLEHANDLETYPES = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkExternalImageFormatPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalImageFormatPropertiesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link VkImageFormatProperties} view of the {@code imageFormatProperties} field. */
    public VkImageFormatProperties imageFormatProperties() { return nimageFormatProperties(address()); }
    /** Returns the value of the {@code externalMemoryFeatures} field. */
    @NativeType("VkExternalMemoryFeatureFlagsNV")
    public int externalMemoryFeatures() { return nexternalMemoryFeatures(address()); }
    /** Returns the value of the {@code exportFromImportedHandleTypes} field. */
    @NativeType("VkExternalMemoryHandleTypeFlagsNV")
    public int exportFromImportedHandleTypes() { return nexportFromImportedHandleTypes(address()); }
    /** Returns the value of the {@code compatibleHandleTypes} field. */
    @NativeType("VkExternalMemoryHandleTypeFlagsNV")
    public int compatibleHandleTypes() { return ncompatibleHandleTypes(address()); }

    // -----------------------------------

    /** Returns a new {@code VkExternalImageFormatPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalImageFormatPropertiesNV malloc() {
        return wrap(VkExternalImageFormatPropertiesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkExternalImageFormatPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalImageFormatPropertiesNV calloc() {
        return wrap(VkExternalImageFormatPropertiesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkExternalImageFormatPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkExternalImageFormatPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkExternalImageFormatPropertiesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkExternalImageFormatPropertiesNV} instance for the specified memory address. */
    public static VkExternalImageFormatPropertiesNV create(long address) {
        return wrap(VkExternalImageFormatPropertiesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalImageFormatPropertiesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkExternalImageFormatPropertiesNV.class, address);
    }

    /**
     * Returns a new {@link VkExternalImageFormatPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalImageFormatPropertiesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExternalImageFormatPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalImageFormatPropertiesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalImageFormatPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalImageFormatPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkExternalImageFormatPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalImageFormatPropertiesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalImageFormatPropertiesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkExternalImageFormatPropertiesNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkExternalImageFormatPropertiesNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkExternalImageFormatPropertiesNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkExternalImageFormatPropertiesNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkExternalImageFormatPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalImageFormatPropertiesNV mallocStack(MemoryStack stack) {
        return wrap(VkExternalImageFormatPropertiesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkExternalImageFormatPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalImageFormatPropertiesNV callocStack(MemoryStack stack) {
        return wrap(VkExternalImageFormatPropertiesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalImageFormatPropertiesNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalImageFormatPropertiesNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalImageFormatPropertiesNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalImageFormatPropertiesNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalImageFormatPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalImageFormatPropertiesNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalImageFormatPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalImageFormatPropertiesNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #imageFormatProperties}. */
    public static VkImageFormatProperties nimageFormatProperties(long struct) { return VkImageFormatProperties.create(struct + VkExternalImageFormatPropertiesNV.IMAGEFORMATPROPERTIES); }
    /** Unsafe version of {@link #externalMemoryFeatures}. */
    public static int nexternalMemoryFeatures(long struct) { return UNSAFE.getInt(null, struct + VkExternalImageFormatPropertiesNV.EXTERNALMEMORYFEATURES); }
    /** Unsafe version of {@link #exportFromImportedHandleTypes}. */
    public static int nexportFromImportedHandleTypes(long struct) { return UNSAFE.getInt(null, struct + VkExternalImageFormatPropertiesNV.EXPORTFROMIMPORTEDHANDLETYPES); }
    /** Unsafe version of {@link #compatibleHandleTypes}. */
    public static int ncompatibleHandleTypes(long struct) { return UNSAFE.getInt(null, struct + VkExternalImageFormatPropertiesNV.COMPATIBLEHANDLETYPES); }

    // -----------------------------------

    /** An array of {@link VkExternalImageFormatPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkExternalImageFormatPropertiesNV, Buffer> implements NativeResource {

        private static final VkExternalImageFormatPropertiesNV ELEMENT_FACTORY = VkExternalImageFormatPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkExternalImageFormatPropertiesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalImageFormatPropertiesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkExternalImageFormatPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link VkImageFormatProperties} view of the {@code imageFormatProperties} field. */
        public VkImageFormatProperties imageFormatProperties() { return VkExternalImageFormatPropertiesNV.nimageFormatProperties(address()); }
        /** Returns the value of the {@code externalMemoryFeatures} field. */
        @NativeType("VkExternalMemoryFeatureFlagsNV")
        public int externalMemoryFeatures() { return VkExternalImageFormatPropertiesNV.nexternalMemoryFeatures(address()); }
        /** Returns the value of the {@code exportFromImportedHandleTypes} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagsNV")
        public int exportFromImportedHandleTypes() { return VkExternalImageFormatPropertiesNV.nexportFromImportedHandleTypes(address()); }
        /** Returns the value of the {@code compatibleHandleTypes} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagsNV")
        public int compatibleHandleTypes() { return VkExternalImageFormatPropertiesNV.ncompatibleHandleTypes(address()); }

    }

}