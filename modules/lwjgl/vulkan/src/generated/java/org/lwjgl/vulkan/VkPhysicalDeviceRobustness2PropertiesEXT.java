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
 * Structure describing robust buffer access properties supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceRobustness2PropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTRobustness2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRobustness2PropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkDeviceSize {@link #robustStorageBufferAccessSizeAlignment};
 *     VkDeviceSize {@link #robustUniformBufferAccessSizeAlignment};
 * }</code></pre>
 */
public class VkPhysicalDeviceRobustness2PropertiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ROBUSTSTORAGEBUFFERACCESSSIZEALIGNMENT,
        ROBUSTUNIFORMBUFFERACCESSSIZEALIGNMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ROBUSTSTORAGEBUFFERACCESSSIZEALIGNMENT = layout.offsetof(2);
        ROBUSTUNIFORMBUFFERACCESSSIZEALIGNMENT = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRobustness2PropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRobustness2PropertiesEXT(ByteBuffer container) {
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
    /** the number of bytes that the range of a storage buffer descriptor is rounded up to when used for bounds-checking when <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> is enabled. This value <b>must</b> be either 1 or 4. */
    @NativeType("VkDeviceSize")
    public long robustStorageBufferAccessSizeAlignment() { return nrobustStorageBufferAccessSizeAlignment(address()); }
    /** the number of bytes that the range of a uniform buffer descriptor is rounded up to when used for bounds-checking when <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> is enabled. This value <b>must</b> be a power of two in the range [1, 256]. */
    @NativeType("VkDeviceSize")
    public long robustUniformBufferAccessSizeAlignment() { return nrobustUniformBufferAccessSizeAlignment(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceRobustness2PropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTRobustness2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceRobustness2PropertiesEXT sType$Default() { return sType(EXTRobustness2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceRobustness2PropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRobustness2PropertiesEXT set(
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
    public VkPhysicalDeviceRobustness2PropertiesEXT set(VkPhysicalDeviceRobustness2PropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRobustness2PropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRobustness2PropertiesEXT malloc() {
        return wrap(VkPhysicalDeviceRobustness2PropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRobustness2PropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRobustness2PropertiesEXT calloc() {
        return wrap(VkPhysicalDeviceRobustness2PropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRobustness2PropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRobustness2PropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceRobustness2PropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRobustness2PropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceRobustness2PropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceRobustness2PropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRobustness2PropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceRobustness2PropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2PropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2PropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2PropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceRobustness2PropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRobustness2PropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRobustness2PropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRobustness2PropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRobustness2PropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRobustness2PropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2PropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2PropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2PropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRobustness2PropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRobustness2PropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #robustStorageBufferAccessSizeAlignment}. */
    public static long nrobustStorageBufferAccessSizeAlignment(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceRobustness2PropertiesEXT.ROBUSTSTORAGEBUFFERACCESSSIZEALIGNMENT); }
    /** Unsafe version of {@link #robustUniformBufferAccessSizeAlignment}. */
    public static long nrobustUniformBufferAccessSizeAlignment(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceRobustness2PropertiesEXT.ROBUSTUNIFORMBUFFERACCESSSIZEALIGNMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRobustness2PropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRobustness2PropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRobustness2PropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRobustness2PropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRobustness2PropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceRobustness2PropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRobustness2PropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRobustness2PropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceRobustness2PropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceRobustness2PropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRobustness2PropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRobustness2PropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRobustness2PropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRobustness2PropertiesEXT#robustStorageBufferAccessSizeAlignment} field. */
        @NativeType("VkDeviceSize")
        public long robustStorageBufferAccessSizeAlignment() { return VkPhysicalDeviceRobustness2PropertiesEXT.nrobustStorageBufferAccessSizeAlignment(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRobustness2PropertiesEXT#robustUniformBufferAccessSizeAlignment} field. */
        @NativeType("VkDeviceSize")
        public long robustUniformBufferAccessSizeAlignment() { return VkPhysicalDeviceRobustness2PropertiesEXT.nrobustUniformBufferAccessSizeAlignment(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceRobustness2PropertiesEXT#sType} field. */
        public VkPhysicalDeviceRobustness2PropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRobustness2PropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTRobustness2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT} value to the {@link VkPhysicalDeviceRobustness2PropertiesEXT#sType} field. */
        public VkPhysicalDeviceRobustness2PropertiesEXT.Buffer sType$Default() { return sType(EXTRobustness2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceRobustness2PropertiesEXT#pNext} field. */
        public VkPhysicalDeviceRobustness2PropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRobustness2PropertiesEXT.npNext(address(), value); return this; }

    }

}