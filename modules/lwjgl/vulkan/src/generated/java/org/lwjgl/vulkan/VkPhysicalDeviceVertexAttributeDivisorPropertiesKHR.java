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
 * Structure describing max value of vertex attribute divisor that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVertexAttributeDivisor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #maxVertexAttribDivisor};
 *     VkBool32 {@link #supportsNonZeroFirstInstance};
 * }</code></pre>
 */
public class VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR extends Struct<VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXVERTEXATTRIBDIVISOR,
        SUPPORTSNONZEROFIRSTINSTANCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXVERTEXATTRIBDIVISOR = layout.offsetof(2);
        SUPPORTSNONZEROFIRSTINSTANCE = layout.offsetof(3);
    }

    protected VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the maximum value of the number of instances that will repeat the value of vertex attribute data when instanced rendering is enabled. */
    @NativeType("uint32_t")
    public int maxVertexAttribDivisor() { return nmaxVertexAttribDivisor(address()); }
    /** specifies whether a non-zero value for the {@code firstInstance} parameter of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#drawing">drawing commands</a> is supported when {@link VkVertexInputBindingDivisorDescriptionKHR}{@code ::divisor} is not 1. */
    @NativeType("VkBool32")
    public boolean supportsNonZeroFirstInstance() { return nsupportsNonZeroFirstInstance(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVertexAttributeDivisor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR sType$Default() { return sType(KHRVertexAttributeDivisor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR set(
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
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR set(VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR malloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR calloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR create(long address) {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #maxVertexAttribDivisor}. */
    public static int nmaxVertexAttribDivisor(long struct) { return memGetInt(struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.MAXVERTEXATTRIBDIVISOR); }
    /** Unsafe version of {@link #supportsNonZeroFirstInstance}. */
    public static int nsupportsNonZeroFirstInstance(long struct) { return memGetInt(struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.SUPPORTSNONZEROFIRSTINSTANCE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR#maxVertexAttribDivisor} field. */
        @NativeType("uint32_t")
        public int maxVertexAttribDivisor() { return VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.nmaxVertexAttribDivisor(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR#supportsNonZeroFirstInstance} field. */
        @NativeType("VkBool32")
        public boolean supportsNonZeroFirstInstance() { return VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.nsupportsNonZeroFirstInstance(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR#sType} field. */
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVertexAttributeDivisor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_KHR} value to the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR#sType} field. */
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer sType$Default() { return sType(KHRVertexAttributeDivisor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR#pNext} field. */
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.npNext(address(), value); return this; }

    }

}