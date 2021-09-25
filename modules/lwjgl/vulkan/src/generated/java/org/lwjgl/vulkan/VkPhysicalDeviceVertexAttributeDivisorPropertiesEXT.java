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
 * <p>If the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVertexAttributeDivisor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #maxVertexAttribDivisor};
 * }</code></pre>
 */
public class VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXVERTEXATTRIBDIVISOR;

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
        MAXVERTEXATTRIBDIVISOR = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(ByteBuffer container) {
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
    /** the maximum value of the number of instances that will repeat the value of vertex attribute data when instanced rendering is enabled. */
    @NativeType("uint32_t")
    public int maxVertexAttribDivisor() { return nmaxVertexAttribDivisor(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVertexAttributeDivisor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT sType$Default() { return sType(EXTVertexAttributeDivisor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT set(
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
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT set(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT malloc() {
        return wrap(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT calloc() {
        return wrap(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #maxVertexAttribDivisor}. */
    public static int nmaxVertexAttribDivisor(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.MAXVERTEXATTRIBDIVISOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT#maxVertexAttribDivisor} field. */
        @NativeType("uint32_t")
        public int maxVertexAttribDivisor() { return VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.nmaxVertexAttribDivisor(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT#sType} field. */
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVertexAttributeDivisor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT} value to the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT#sType} field. */
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer sType$Default() { return sType(EXTVertexAttributeDivisor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT#pNext} field. */
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.npNext(address(), value); return this; }

    }

}